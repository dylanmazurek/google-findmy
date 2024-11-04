package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqx implements nra {
    public final nrb a;

    private nqx(nrb nrbVar) {
        this.a = nrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nra b(nrb nrbVar) {
        if (nrbVar instanceof nrb) {
            return nrbVar;
        }
        if (nrbVar == null) {
            return null;
        }
        return new nqx(nrbVar);
    }

    @Override // defpackage.nra
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        return this.a.a.c(nqwVar, charSequence.toString(), i);
    }
}
