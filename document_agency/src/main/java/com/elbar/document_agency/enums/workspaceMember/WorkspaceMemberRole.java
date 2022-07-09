package com.elbar.document_agency.enums.workspaceMember;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum WorkspaceMemberRole {
    ADMIN("ADMIN"),
    VIEWER("VIEWER"),
    EDITOR("EDITOR");
    private final String value;
}
