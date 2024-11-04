package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jac implements ljp {
    OWNER_USER_TYPE_UNKNOWN(0),
    GOOGLE_USER(1),
    GPLUS_USER(2),
    GPLUS_DISABLED_BY_ADMIN(3),
    GOOGLE_APPS_USER(4),
    GOOGLE_APPS_SELF_MANAGED_USER(5),
    GOOGLE_FAMILY_USER(6),
    GOOGLE_FAMILY_CHILD_USER(7),
    GOOGLE_APPS_ADMIN_DISABLED(9),
    GOOGLE_ONE_USER(10),
    GOOGLE_FAMILY_CONVERTED_CHILD_USER(11);

    private final int l;

    jac(int i) {
        this.l = i;
    }

    public static jac b(int i) {
        switch (i) {
            case 0:
                return OWNER_USER_TYPE_UNKNOWN;
            case 1:
                return GOOGLE_USER;
            case 2:
                return GPLUS_USER;
            case 3:
                return GPLUS_DISABLED_BY_ADMIN;
            case 4:
                return GOOGLE_APPS_USER;
            case 5:
                return GOOGLE_APPS_SELF_MANAGED_USER;
            case 6:
                return GOOGLE_FAMILY_USER;
            case 7:
                return GOOGLE_FAMILY_CHILD_USER;
            case 8:
            default:
                return null;
            case 9:
                return GOOGLE_APPS_ADMIN_DISABLED;
            case 10:
                return GOOGLE_ONE_USER;
            case 11:
                return GOOGLE_FAMILY_CONVERTED_CHILD_USER;
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
