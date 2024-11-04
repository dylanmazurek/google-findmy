package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqs extends nqk {
    public nqs(nns nnsVar, int i, boolean z) {
        super(nnsVar, i, z);
    }

    @Override // defpackage.nrc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        if (nohVar.f(this.a)) {
            try {
                nqy.d(appendable, nohVar.b(this.a));
                return;
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
                return;
            }
        }
        appendable.append((char) 65533);
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        try {
            nqy.d(appendable, this.a.a(nnoVar).a(j));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
