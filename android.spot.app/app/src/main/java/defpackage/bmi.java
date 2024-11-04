package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmi extends bme {
    final /* synthetic */ bmj c;

    public bmi(bmj bmjVar) {
        this.c = bmjVar;
    }

    @Override // defpackage.bme
    protected final String b() {
        bmf bmfVar = (bmf) this.c.a.get();
        if (bmfVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + bmfVar.a + "]";
    }
}
