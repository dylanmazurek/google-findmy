package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrw implements msc {
    private final mrv[] a;

    public mrw(mrv[] mrvVarArr) {
        this.a = mrvVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            mrv[] mrvVarArr = this.a;
            if (i < mrvVarArr.length) {
                mtl mtlVar = mrvVarArr[i].a;
                if (mtlVar == null) {
                    mpd.b("handle");
                    mtlVar = null;
                }
                mtlVar.dc();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.msc
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
