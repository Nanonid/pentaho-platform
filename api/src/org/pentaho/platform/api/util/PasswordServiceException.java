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
 * Copyright 2005 - 2008 Pentaho Corporation.  All rights reserved.
 *
 * @created Jul 01, 2008 
 * @author Ramaiz Mansoor
 * 
 */
package org.pentaho.platform.api.util;

public class PasswordServiceException extends PentahoCheckedChainedException {

   /**
   * 
   */
  private static final long serialVersionUID = -6089798664483298023L;

  /**
   * 
   */
  public PasswordServiceException() {
    super();
  }

  /**
   * @param message
   */
  public PasswordServiceException(String message) {
    super(message);
  }

  /**
   * @param message
   * @param reas
   */
  public PasswordServiceException(String message, Throwable reas) {
    super(message, reas);
  }

  /**
   * @param reas
   */
  public PasswordServiceException(Throwable reas) {
    super(reas);
  }

}
