package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihr implements ihm {
    private final ihk a;

    public ihr(ihk ihkVar) {
        this.a = ihkVar;
    }

    @Override // defpackage.ihm
    public final jyz a(kxx kxxVar, ihn ihnVar, ihw ihwVar) {
        boolean z;
        kyr kyrVar;
        if (kxxVar.a == 10) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        if (kxxVar.a == 10) {
            kyrVar = (kyr) kxxVar.b;
        } else {
            kyrVar = kyr.b;
        }
        kxv kxvVar = kyrVar.a;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        return iuu.o(this.a.c(kxvVar), new ihq(0), jxv.a);
    }
}
