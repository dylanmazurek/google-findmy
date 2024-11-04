package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvh extends jia {
    final /* synthetic */ Map.Entry a;

    public jvh(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.jia
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.jia, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jia, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new jvn((List) this.a.getValue());
    }
}
