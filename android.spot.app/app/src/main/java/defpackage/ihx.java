package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ihx {
    RIGHT_BUD(0, kyh.DEVICE_COMPONENT_RIGHT),
    LEFT_BUD(1, kyh.DEVICE_COMPONENT_LEFT),
    CASE(2, kyh.DEVICE_COMPONENT_CASE),
    BOTH_BUDS(254, kyh.DEVICE_COMPONENT_RIGHT, kyh.DEVICE_COMPONENT_LEFT),
    CASE_WITH_BOTH_BUDS(255, kyh.DEVICE_COMPONENT_RIGHT, kyh.DEVICE_COMPONENT_LEFT, kyh.DEVICE_COMPONENT_CASE);

    public final byte f;
    public final jjr g;

    ihx(int i, kyh... kyhVarArr) {
        this.f = (byte) i;
        this.g = jjr.n(kyhVarArr);
    }
}
