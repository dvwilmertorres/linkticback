package org.linktic.model;


import lombok.Data;

@Data
public class ErrorControlDto {
    private Integer pkErrorId;
    private Integer idErrorMessage;
    private String Message;
}
