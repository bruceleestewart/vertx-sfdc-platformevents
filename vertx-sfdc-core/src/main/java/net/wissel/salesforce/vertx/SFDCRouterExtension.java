/** ========================================================================= *
 * Copyright (C)  2017, 2018 Salesforce Inc ( http://www.salesforce.com/ )    *
 *                            All rights reserved.                            *
 *                                                                            *
 *  @author     Stephan H. Wissel (stw) <swissel@salesforce.com>              *
 *                                       @notessensei                         *
 * @version     1.0                                                           *
 * ========================================================================== *
 *                                                                            *
 * Licensed under the  Apache License, Version 2.0  (the "License").  You may *
 * not use this file except in compliance with the License.  You may obtain a *
 * copy of the License at <http://www.apache.org/licenses/LICENSE-2.0>.       *
 *                                                                            *
 * Unless  required  by applicable  law or  agreed  to  in writing,  software *
 * distributed under the License is distributed on an  "AS IS" BASIS, WITHOUT *
 * WARRANTIES OR  CONDITIONS OF ANY KIND, either express or implied.  See the *
 * License for the  specific language  governing permissions  and limitations *
 * under the License.                                                         *
 *                                                                            *
 * ========================================================================== *
 */
package net.wissel.salesforce.vertx;

import io.vertx.ext.web.Router;

/**
 * Interface that ensures we can hand the Router to a Verticle
 * 
 * @author swissel
 *
 */
public interface SFDCRouterExtension {
	
	/**
	 * Capture the Router to be able to extend routes
	 * @param router the router
	 * @return fluid self
	 */
	//public SFDCRouterExtension setRouter(final Router router);
	
	/**
	 * Add routes defined in the Verticles
	 * Used for WebService or Listener
	 * 
	 * @param router the main router
	 * @return fluid self
	 */
	public SFDCRouterExtension addRoutes(Router router);

}
