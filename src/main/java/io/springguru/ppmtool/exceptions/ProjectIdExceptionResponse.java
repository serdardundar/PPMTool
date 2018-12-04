package io.springguru.ppmtool.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author serdardundar
 * @since 03/12/2018
 */
@Getter
@Setter
@AllArgsConstructor
public class ProjectIdExceptionResponse {

    private String projectIdentifier;
}
