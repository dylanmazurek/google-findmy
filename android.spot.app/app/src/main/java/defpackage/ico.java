package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ico {
    READ_BEACON_STATE((byte) 0),
    READ_PROVISIONING_STATE((byte) 1),
    SET_EPHEMERAL_IDENTIFIER_KEY((byte) 2),
    CLEAR_EPHEMERAL_IDENTIFIER_KEY((byte) 3),
    READ_EPHEMERAL_IDENTIFIER_KEY_WITH_USER_CONSENT((byte) 4),
    RING((byte) 5),
    READ_RINGING_STATE((byte) 6),
    ACTIVATE_UNWANTED_TRACKING_PROTECTION_MODE((byte) 7),
    DEACTIVATE_UNWANTED_TRACKING_PROTECTION_MODE((byte) 8),
    MULTICOMPONENT_OPERATION((byte) 9),
    RANGING_CAPABILITY_REQUEST((byte) 10),
    SET_RANGING_CONFIGURATION((byte) 11),
    START_RANGING((byte) 12),
    STOP_RANGING((byte) 13);

    public final byte o;

    ico(byte b) {
        this.o = b;
    }
}
