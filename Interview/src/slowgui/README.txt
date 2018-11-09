This GUI fetches several pieces of data from a slow remote source, and
updates a status indication after each fetch.  Right now, the GUI is 
unresponsive during the fetches.  Fix this problem so that the GUI can
redraw itself while it is waiting for data to arrive.