package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jez extends jdm {
    final /* synthetic */ jck f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jez(kru kruVar, CharSequence charSequence, jck jckVar) {
        super(kruVar, charSequence);
        this.f = jckVar;
    }

    @Override // defpackage.jdm
    public final int a(int i) {
        return ((Matcher) this.f.a).end();
    }

    @Override // defpackage.jdm
    public final int b(int i) {
        if (((Matcher) this.f.a).find(i)) {
            return ((Matcher) this.f.a).start();
        }
        return -1;
    }
}
