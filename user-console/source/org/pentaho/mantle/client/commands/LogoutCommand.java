/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2008 Pentaho Corporation.  All rights reserved.
 */
package org.pentaho.mantle.client.commands;

import com.google.gwt.user.client.Command;

public class LogoutCommand implements Command {

  public LogoutCommand() {
  }

  public native void execute()
  /*-{
    var loc = $wnd.location.href.substring(0, $wnd.location.href.lastIndexOf('/')) + "/Logout";
    if($wnd.opener != null){
      try{
        if($wnd.opener.location.href.indexOf($wnd.location.host) > -1){
          $wnd.opener.location.href = loc;
          $wnd.close();
          return;
        }
      } catch(e){
        //XSS exception when original window changes domain
      }
    }
    $wnd.open(loc, "_top","");
  }-*/;

}
