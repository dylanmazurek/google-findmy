package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqm implements nrc, nra {
    private final String a;

    public nqm(String str) {
        this.a = str;
    }

    @Override // defpackage.nra
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.nrc
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        if (nqt.d(charSequence, i, this.a)) {
            return i + this.a.length();
        }
        return ~i;
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        appendable.append(this.a);
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        appendable.append(this.a);
    }
}
