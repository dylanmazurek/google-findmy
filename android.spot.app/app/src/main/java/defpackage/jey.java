package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jey implements jfb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jey(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jfb
    public final /* synthetic */ Iterator a(kru kruVar, CharSequence charSequence) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new jez(kruVar, charSequence, ((jed) this.a).a(charSequence));
            }
            return new jew(this, kruVar, charSequence);
        }
        return new jex(this, kruVar, charSequence);
    }
}
