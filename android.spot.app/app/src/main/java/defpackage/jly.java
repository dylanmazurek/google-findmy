package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jly extends jlz implements jkt {
    private static final long serialVersionUID = 0;

    public jly(jkt jktVar) {
        super(jktVar);
    }

    @Override // defpackage.jlz, defpackage.jib
    /* renamed from: c */
    public final /* synthetic */ jls g() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jls, jkt] */
    @Override // defpackage.jlz, defpackage.jib, defpackage.jls
    /* renamed from: d */
    public final List b(Object obj) {
        return DesugarCollections.unmodifiableList(this.a.b(obj));
    }

    @Override // defpackage.jlz, defpackage.jib, defpackage.jic
    public final /* synthetic */ Object g() {
        return this.a;
    }
}
