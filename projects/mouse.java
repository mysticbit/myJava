/* Author : touruni
 * AppName: MOUSE (Mac OSX Update Services Express)
 * Date   : 10-07-2011
 * Version: 0.01
 * Desc.  : This program will perform the following:
 *           1. Create an authentication interface to login
 *              a. It will leverage AD for authentication challenge
 *              b. Forward that authentication for using on the remote systems
 *              c. Allow for a single IP to be targeted
 *              d. Allow for a range of IPs to be targeted (subnet)
 *              e. Allow for a selection of IPs to be targeted              
 *           2. Check to see if a Mac OS X system requires any updates
 *              a. If it does    - perform the update
 *              b. If it doesn't - don't perform the update
 *           3. After completion of Step 1. Report the results back
 *              to a central location (DB, flat file, etc)
 *
 *           Additional Items: Make a GUI interface for user to:
 *           - Enter a remote IP
 *           - Enter an admin account to use
 *           - Execute a particular command (update/report/reboot/system information) 
 *           - Take remote control of the Mac OS laptop
 *           - Send a text message to user
 *           - Install a software
 *           - WEB server or standalone application
 *           - 
 * 
 *
 *         Mac OSX Update Service Express -  MOUSE 
 */



//Get the version of the Mac OS X



//Get the Machine name, IP address, MAC address and user signed in



//Check to see if updates is required



//Perform Updates



//Report back the results


/* Some NOTES
 *
 * 
 * man softwareupdate - for information on specific commands
 *
