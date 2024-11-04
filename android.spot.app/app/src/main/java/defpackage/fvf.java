package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fvf implements ljp {
    UNKNOWN(0),
    NULL_ACCOUNT(1),
    GOOGLE(2),
    DEVICE(3),
    SIM(4),
    EXCHANGE(5),
    THIRD_PARTY_EDITABLE(6),
    THIRD_PARTY_READONLY(7),
    SIM_SDN(8),
    PRELOAD_SDN(9);

    public final int k;

    fvf(int i) {
        this.k = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
