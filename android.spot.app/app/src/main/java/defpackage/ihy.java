package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ihy {
    COMPONENTLESS(jdl.a),
    RIGHT_BUD(jer.i(ihx.RIGHT_BUD)),
    LEFT_BUD(jer.i(ihx.LEFT_BUD)),
    CASE(jer.i(ihx.CASE)),
    BOTH_BUDS(jer.i(ihx.BOTH_BUDS)),
    CASE_WITH_BOTH_BUDS(jer.i(ihx.CASE_WITH_BOTH_BUDS));

    private final jer h;

    ihy(jer jerVar) {
        this.h = jerVar;
    }

    public static ihy b(ihx ihxVar) {
        ihx ihxVar2 = ihx.RIGHT_BUD;
        int ordinal = ihxVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return CASE_WITH_BOTH_BUDS;
                    }
                    return BOTH_BUDS;
                }
                return CASE;
            }
            return LEFT_BUD;
        }
        return RIGHT_BUD;
    }

    public final ihx a() {
        hwx.U(this.h.g());
        return (ihx) this.h.c();
    }

    public final jjr c() {
        return (jjr) this.h.b(new ihq(2)).e(new jms(kyh.DEVICE_COMPONENT_UNSPECIFIED));
    }

    public final boolean d() {
        if (!this.h.g()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return (String) this.h.b(new ihq(3)).e("device");
    }
}
