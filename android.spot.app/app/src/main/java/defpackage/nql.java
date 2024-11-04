package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class nql extends nqk {
    protected final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public nql(nns nnsVar, int i, boolean z, int i2) {
        super(nnsVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.nrc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        if (nohVar.f(this.a)) {
            try {
                nqy.b(appendable, nohVar.b(this.a), this.d);
                return;
            } catch (RuntimeException unused) {
                nqt.b(appendable, this.d);
                return;
            }
        }
        nqt.b(appendable, this.d);
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        try {
            nqy.b(appendable, this.a.a(nnoVar).a(j), this.d);
        } catch (RuntimeException unused) {
            nqt.b(appendable, this.d);
        }
    }
}
