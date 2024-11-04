package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum SemanticLabel {
    UNLABELED(0),
    SKY(1),
    BUILDING(2),
    TREE(3),
    ROAD(4),
    SIDEWALK(5),
    TERRAIN(6),
    STRUCTURE(7),
    OBJECT(8),
    VEHICLE(9),
    PERSON(10),
    WATER(11);

    final int nativeCode;

    SemanticLabel(int i) {
        this.nativeCode = i;
    }

    static SemanticLabel forNumber(int i) {
        for (SemanticLabel semanticLabel : values()) {
            if (semanticLabel.nativeCode == i) {
                return semanticLabel;
            }
        }
        throw new FatalException(a.ae(i, "Unexpected value for native SemanticLabel, value="));
    }
}
