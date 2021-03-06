/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callRecord;

import java.time.LocalDateTime;

/**
 *
 * @author Dan Brown
 */
public class CallRecordDTO {
    
    /**
     * The unique identifier for this call
     */
    private int callId = 0;
    
    /**
     * The unique id for the agent taking the call
     */
    private int agent_id = 0;
    
    /**
     * The unique identifier for the individual calling the crisis center
     */
    private String caller_id = "";
    
    /**
     * The summary of the call
     */
    private String call_description = "";
    
    /**
     * The type of call received
     */
    private String call_type_name = "";
    
    /**
     * Date and time the call was answered
     */
    private LocalDateTime start_time = null;
    
    /**
     * Date and time the call was ended
     */
    private LocalDateTime end_time = null;

    public CallRecordDTO() {
        
    }
    
    
    
    public CallRecordDTO(int callId, int agentId, String callerId, String callDescription, String callTypeName, LocalDateTime startTime, LocalDateTime endTime) {
        
        this.callId = callId;
        this.agent_id = agentId;
        this.caller_id = callerId;
        this.call_description = callDescription;
        this.call_type_name = callTypeName;
        this.start_time = startTime;
        this.end_time = endTime;        
    }
    
    /**
     * The unique identifier for this call
     * @return the callId
     */
    public int getCallId() {
        return callId;
    }

    /**
     * The unique identifier for this call
     * @param callId the callId to set
     */
    public void setCallId(int callId) {
        this.callId = callId;
    }

    /**
     * The unique id for the agent taking the call
     * @return the agent_id
     */
    public int getAgent_id() {
        return agent_id;
    }

    /**
     * The unique id for the agent taking the call
     * @param agent_id the agent_id to set
     */
    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    /**
     * Get the unique identifier for the individual calling the crisis center
     * @return caller_id int.
     */
    public String getCaller_Id() {
        return caller_id;
    }

    /**
     * Set the unique identifier for the individual calling the crisis center
     * @param caller_id 
     */
    public void setCaller_Id(String caller_id) {
        this.caller_id = caller_id;
    }
    

    /**
     * The summary of the call
     * @return the call_description
     */
    public String getCall_description() {
        return call_description;
    }

    /**
     * The summary of the call
     * @param call_description the call_description to set
     */
    public void setCall_description(String call_description) {
        this.call_description = call_description;
    }

    /**
     * The type of call received
     * @return the call_type_name
     */
    public String getCall_type_name() {
        return call_type_name;
    }

    /**
     * The type of call received
     * @param call_type_name the call_type_name to set
     */
    public void setCall_type_name(String call_type_name) {
        this.call_type_name = call_type_name;
    }

    /**
     * Date and time the call was answered
     * @return the start_time
     */
    public LocalDateTime getStart_time() {
        return start_time;
    }

    /**
     * Date and time the call was answered
     * @param start_time the start_time to set
     */
    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    /**
     * Date and time the call was ended
     * @return the end_time
     */
    public LocalDateTime getEnd_time() {
        return end_time;
    }

    /**
     * Date and time the call was ended
     * @param end_time the end_time to set
     */
    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }
    
    
    
    
}
