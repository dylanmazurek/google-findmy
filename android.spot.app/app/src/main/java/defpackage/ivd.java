package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivd implements ivk {
    final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public ivd(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ivk
    public final iva a(iva ivaVar) {
        if (this.b != 0) {
            if (ivaVar instanceof ivh) {
                return ivaVar;
            }
            return new iuz(this.a, ivaVar);
        }
        if (ivaVar instanceof ivh) {
            return ivaVar;
        }
        return new iuz(this.a, ivaVar);
    }
}
