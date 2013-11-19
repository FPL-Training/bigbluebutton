package org.bigbluebutton.apps.protocol

import org.bigbluebutton.apps.models.JoinedUser
import org.bigbluebutton.apps.models.UserIdAndName
import org.bigbluebutton.apps.models.RegisteredUser
import org.bigbluebutton.apps.models.MeetingSession
import org.bigbluebutton.apps.models.MeetingSpec
import org.bigbluebutton.apps.models.MeetingConfig

case class CreateMeetingRequestReply(session: MeetingSession, meeting: MeetingConfig)
case class MeetingCreated(session: MeetingSession, meeting: MeetingConfig)

case class MeetingHeader(name: String, externalId: String, session: String)

case class UserRegistered(meeting: MeetingHeader, user: RegisteredUser)
case class EndAndKickAll(meeting: MeetingHeader) 
case class GetUsersReply(meeting: MeetingHeader, users: Seq[JoinedUser]) 
case class PresenterAssigned(meeting: MeetingHeader, newPresenter: UserIdAndName, assignedBy: UserIdAndName) 
case class UserJoined(meeting: MeetingHeader, user: JoinedUser) 
case class UserLeft(meeting: MeetingHeader, user: UserIdAndName) 
case class UserStatusChange(meeting: MeetingHeader, user: UserIdAndName, status: String, value: Object) 