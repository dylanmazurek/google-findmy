package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fag implements faf {
    private final Context a;

    public fag(Context context) {
        this.a = context;
    }

    @Override // defpackage.faf
    public final bym a(fac facVar) {
        if (new fac().equals(facVar)) {
            return new bym(this.a, null, null, null);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(facVar.toString()));
    }
}
