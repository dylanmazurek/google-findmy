package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kyt implements ljp {
    FMDN_DISABLED_DEFAULT(0),
    FMDN_CONTRIBUTOR_HIGH_TRAFFIC(3),
    FMDN_CONTRIBUTOR_ALL_LOCATIONS(4),
    FMDN_HIGH_TRAFFIC(1),
    FMDN_ALL_LOCATIONS(2),
    UNRECOGNIZED(-1);

    private final int g;

    kyt(int i) {
        this.g = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
