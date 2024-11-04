package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ets {
    public final jer a;
    public final jer b;
    public final int c;

    public ets() {
        throw null;
    }

    public static ets a(etr etrVar) {
        return new ets(4, jer.i(etrVar), jdl.a);
    }

    public static ets b() {
        jdl jdlVar = jdl.a;
        return new ets(8, jdlVar, jdlVar);
    }

    public static ets c(etr etrVar) {
        return new ets(3, jer.i(etrVar), jdl.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ets) {
            ets etsVar = (ets) obj;
            if (this.c == etsVar.c && this.a.equals(etsVar.a) && this.b.equals(etsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.N(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.c) {
            case 1:
                str = "FETCHING_DETAILS";
                break;
            case 2:
                str = "FAILED_FETCHING_DETAILS";
                break;
            case 3:
                str = "WAITING_FOR_APPLICATION";
                break;
            case 4:
                str = "APPLICATION_IN_PROGRESS";
                break;
            case 5:
                str = "MANUAL_OWNER_KEY_SYNC_REQUIRED";
                break;
            case 6:
                str = "MANUAL_OWNER_KEY_SYNC_IN_PROGRESS";
                break;
            case 7:
                str = "APPLIED_SUCCESSFULLY";
                break;
            default:
                str = "NOT_SUPPORTED";
                break;
        }
        jer jerVar = this.a;
        jer jerVar2 = this.b;
        return "SharingApplicationState{state=" + str + ", deviceDetails=" + jerVar.toString() + ", ownerKeySyncResolution=" + jerVar2.toString() + "}";
    }

    public ets(int i, jer jerVar, jer jerVar2) {
        this.c = i;
        this.a = jerVar;
        this.b = jerVar2;
    }
}
