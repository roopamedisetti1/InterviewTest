pragma solidity ^0.4.24;

import './ERC721.sol';
import './Ownable.sol';
import './Pausable.sol';
import './ERC721Receiver.sol';
import './ERC721Token.sol';




//actual contract created by Artist or Winery

contract ArtWine is ERC721Token  {


     bytes4 constant INTERFACE_SIGNATURE_ERC721 =
        bytes4(keccak256('name()')) ^
        bytes4(keccak256('symbol()')) ^
        bytes4(keccak256('totalSupply()')) ^
        bytes4(keccak256('balanceOf(address)')) ^
        bytes4(keccak256('ownerOf(uint256)')) ^
        bytes4(keccak256('approve(address,uint256)')) ^
        bytes4(keccak256('transfer(address,uint256)')) ^
        bytes4(keccak256('transferFrom(address,address,uint256'));

     address public contractOwner;
     string ttype;

      /*** EVENTS ***/

   event Transfer(address indexed _from, address indexed _to, uint256 _tokenId);
   event Approval(address indexed _owner, address indexed _approved, uint256 _tokenId);
     event ApprovalForAll(
    address indexed _owner,
    address indexed _operator,
    bool _approved
  );


       /*** DATA TYPES ***/

     struct Painting {
         string title;
         string picture;
         string description;
         uint256 amt;
     }


       /*** STORAGE ***/

     Painting[] public arts;


    //maaping from token ID to owner
     mapping (uint256 => address) public artToOwner;

     //mapping from owner to list of owned token IDs
     mapping (address => uint256[]) public ownerArtCount;
     mapping (uint256 => address) public tokenIndexToApproved;


     // function ArtWine(string _expectedType, address creator) public {

        // contractOwner = creator;
        // ttype = _expectedType;
     // }


        /*** INTERNAL FUNCTIONS ***/

      constructor(string expectedType, address _owner) public {
          require(_owner != address(0) && _owner != address(this));
           contractOwner = _owner;
      }



       //This function creates the painting with given details.
      function createPainting(string _title, string _picture, string _description, uint256 _amt)  public {
         require(msg.sender.balance >= .01 ether);
          uint id = arts.push(Painting(_title, _picture, _description, _amt )) - 1;
          artToOwner[id] = msg.sender;
          ownerArtCount[msg.sender].push(id);

      }


    function getPaintingCount() public view returns (uint)
     {
             return arts.length;
     }



      /**
    * @dev Purchase _tokenId
    * @param _tokenId uint256 token ID (painting number)
    */
    function purchaseToken(uint256 _tokenId) public payable  {
       require(msg.sender != address(0) && msg.sender != address(this));
       require(msg.value >= arts[_tokenId].amt);

         address tokenSeller = ownerOf(_tokenId);

        // address tokenSeller = contractOwner.ownerOf(_tokenId);
     //   contractOwner.safeTransferFrom(tokenSeller, msg.sender, _tokenId);(this is not working)
       safeTransferFrom(tokenSeller, msg.sender, _tokenId, "");

    }


        /// @notice Transfer ownership of an NFT -- THE CALLER IS RESPONSIBLE
    ///  TO CONFIRM THAT `_to` IS CAPABLE OF RECEIVING NFTS OR ELSE
    ///  THEY MAY BE PERMANENTLY LOST
    /// @dev Throws unless `msg.sender` is the current owner, an authorized
    ///  operator, or the approved address for this NFT. Throws if `_from` is
    ///  not the current owner. Throws if `_to` is the zero address. Throws if
    ///  `_tokenId` is not a valid NFT.
    /// @param _from The current owner of the NFT
    /// @param _to The new owner
    /// @param _tokenId The NFT to transfer
 //   function transferFrom(address _from, address _to, uint256 _tokenId) public {
        //Check Transferable
        //There is a token validity check in ownerOf
      //  address owner = ownerOf(_tokenId);

    //    require ( owner == msg.sender );            //Require sender owns token
            //Doing the two below manually instead of referring to the external methods saves gas
         //   || allowance[_tokenId] == msg.sender      //or is approved for this token
          //  || authorised[owner][msg.sender]          //or is approved for all
       // );
    //    require(owner == _from);
       // require(_to != 0x0);
        //require(isValidToken(_tokenId)); <-- done by ownerOf

      //  emit Transfer(_from, _to, _tokenId);

      //  artToOwner[_tokenId] = _to;
      //  _to.transfer(msg.value);

         // ownerArtCount[msg.sender].push(id);

       // balances[_from]--;
       // balances[_to]++;
        //Reset approved if there is one
   //     if(allowance[_tokenId] != 0x0){
          //  delete allowance[_tokenId];
       // }
  //  }

    /// @notice Transfers the ownership of an NFT from one address to another address
    /// @dev Throws unless `msg.sender` is the current owner, an authorized
    ///  operator, or the approved address for this NFT. Throws if `_from` is
    ///  not the current owner. Throws if `_to` is the zero address. Throws if
    ///  `_tokenId` is not a valid NFT. When transfer is complete, this function
    ///  checks if `_to` is a smart contract (code size > 0). If so, it calls
    ///  `onERC721Received` on `_to` and throws if the return value is not
    ///  `bytes4(keccak256("onERC721Received(address,address,uint256,bytes)"))`
    /// @param _from The current owner of the NFT
    /// @param _to The new owner
    /// @param _tokenId The NFT to transfer
    /// @param data Additional data with no specified format, sent in call to `_to`
    function safeTransferFrom(address _from, address _to, uint256 _tokenId, bytes data) public {
        _transfer(_from, _to, _tokenId);

        //Get size of "_to" address, if 0 it's a wallet
        uint32 size;
        assembly {
            size := extcodesize(_to)
        }
        if(size > 0){
            ERC721Receiver receiver = ERC721Receiver(_to);
            require(receiver.onERC721Received(msg.sender,_from,_tokenId,data) == bytes4(keccak256("onERC721Received(address,address,uint256,bytes)")));
        }

    }




       function _approve(address _to, uint256 _tokenId) public {
   // tokenIndexToApproved[_tokenId] = _to;

     //  Approval(tokenIndexToOwner[_tokenId], tokenIndexToApproved[_tokenId], _tokenId);
     }

  function _transfer(address _from, address _to, uint256 _tokenId) public {
   // ownershipTokenCount[_to]++;
  //  tokenIndexToOwner[_tokenId] = _to;

    if (_from != address(0)) {
    //  ownershipTokenCount[_from]--;
      delete tokenIndexToApproved[_tokenId];
    }

    Transfer(_from, _to, _tokenId);
  }


   /*** ERC721 IMPLEMENTATION ***/



  function balanceOf(address _owner) public view returns (uint256) {
    return ownerArtCount[_owner].length;
  }

  function ownerOf(uint256 _tokenId) public view returns (address owner) {
    owner = artToOwner[_tokenId];

    require(owner != address(0));
  }

  function approve(address _to, uint256 _tokenId) public {
   // require(_owns(msg.sender, _tokenId));

    _approve(_to, _tokenId);
  }

  function transfer(address _to, uint256 _tokenId) external {
    require(_to != address(0));
    require(_to != address(this));
  //  require(_owns(msg.sender, _tokenId));

    _transfer(msg.sender, _to, _tokenId);
  }

  function transferFrom(address _from, address _to, uint256 _tokenId) public {
    require(_to != address(0));
    require(_to != address(this));
  //  require(_approvedFor(msg.sender, _tokenId));
  //  require(_owns(_from, _tokenId));

    _transfer(_from, _to, _tokenId);
  }


  function exists(uint256 _tokenId) public view returns (bool _exists)
  {
      return true;
  }


  function getApproved(uint256 _tokenId) public view returns (address _operator)
  {
      return msg.sender;
  }

  function setApprovalForAll(address _operator, bool _approved) public {

  }

  function isApprovedForAll(address _owner, address _operator)    public view returns (bool)
  {

  }


  function safeTransferFrom(address _from, address _to, uint256 _tokenId)    public {

  }



    //remove them
     function totalySupply() public view returns (uint) {
           return ownerArtCount[msg.sender].length;
       }

  function supportsInterface(bytes4 _interfaceId) external view returns (bool) {
       return (_interfaceId == INTERFACE_SIGNATURE_ERC721);
    }

      function tokenURI(uint256 _tokenId) public view returns (string)
      {
          "rrtrt";
      }



}
