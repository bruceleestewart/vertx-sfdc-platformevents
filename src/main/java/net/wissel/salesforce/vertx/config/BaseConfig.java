/** ========================================================================= *
 * Copyright (C)  2017, 2018 Salesforce Inc ( http://www.salesforce.com/      *
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
package net.wissel.salesforce.vertx.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Common methods of the configuration classes
 *
 * @author stw
 *
 */
public class BaseConfig {

	/**
	 * Class that implements that listener, one per type
	 *
	 */
	private String verticleName;

	/**
	 * How many to deploy
	 */
	private int verticleInstanceCount = 1;

	/**
	 * Should it be deployed as worker
	 */
	private boolean deployAsWorker = false;

	/**
	 * Shall the loader start the verticle after deployment
	 */
	private boolean autoStart = true;

	/**
	 * Is the verticle allow to listen/act?
	 */
	private boolean enabled = true;

	/**
	 * Does the verticle provide a router extension - pretty hack, we might want
	 * to let that one go sometime
	 */
	private boolean providesRouterExtension = false;

	/**
	 * Other parameters
	 */
	private Map<String, String> parameters = new HashMap<String, String>();

	public void addParameter(final String key, final String value) {
		this.parameters.put(key, value);
	}

	/**
	 * @return the parameters
	 */
	public Map<String, String> getParameters() {
		return this.parameters;
	}

	/**
	 * @return the verticleInstanceCount
	 */
	public int getVerticleInstanceCount() {
		return this.verticleInstanceCount;
	}

	/**
	 * @return the verticleName
	 */
	public String getVerticleName() {
		return this.verticleName;
	}

	/**
	 * @return the autoStart
	 */
	public boolean isAutoStart() {
		return this.autoStart;
	}

	/**
	 * @return the deployAsWorker
	 */
	public boolean isDeployAsWorker() {
		return this.deployAsWorker;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return this.enabled;
	}

	/**
	 * @return the providesRouterExtension
	 */
	public boolean isProvidesRouterExtension() {
		return this.providesRouterExtension;
	}

	/**
	 * @param autoStart
	 *            the autoStart to set
	 */
	public final void setAutoStart(final boolean autoStart) {
		this.autoStart = autoStart;
	}

	/**
	 * @param deployAsWorker
	 *            the deployAsWorker to set
	 */
	public final void setDeployAsWorker(final boolean deployAsWorker) {
		this.deployAsWorker = deployAsWorker;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public final void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public final void setParameters(final Map<String, String> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @param providesRouterExtension
	 *            the providesRouterExtension to set
	 */
	public final void setProvidesRouterExtension(final boolean providesRouterExtension) {
		this.providesRouterExtension = providesRouterExtension;
	}

	/**
	 * @param verticleInstanceCount
	 *            the verticleInstanceCount to set
	 */
	public final void setVerticleInstanceCount(final int verticleInstanceCount) {
		this.verticleInstanceCount = verticleInstanceCount;
	}

	/**
	 * @param verticleName
	 *            the verticleName to set
	 */
	public final void setVerticleName(final String verticleName) {
		this.verticleName = verticleName;
	}

}