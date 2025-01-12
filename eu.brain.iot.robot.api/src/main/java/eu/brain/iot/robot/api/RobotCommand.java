/*******************************************************************************
 * Copyright (C) 2021 LINKS Foundation
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package eu.brain.iot.robot.api;

import eu.brain.iot.eventing.api.BrainIoTEvent;

public abstract class RobotCommand extends BrainIoTEvent {

	public static final int ALL_ROBOTS = -1;
	
	public int robotID;
}