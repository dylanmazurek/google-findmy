package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqh extends nql {
    public nqh(nns nnsVar, int i) {
        super(nnsVar, i, false, i);
    }

    @Override // defpackage.nqk, defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        char charAt;
        int c = super.c(nqwVar, charSequence, i);
        if (c < 0) {
            return c;
        }
        int i2 = this.b + i;
        if (c != i2) {
            if (this.c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            if (c > i2) {
                return ~(i2 + 1);
            }
            if (c < i2) {
                return ~c;
            }
            return c;
        }
        return c;
    }
}
