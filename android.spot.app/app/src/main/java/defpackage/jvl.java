package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvl extends jia {
    final /* synthetic */ Map.Entry a;

    public jvl(Map.Entry entry) {
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
    public final Object setValue(Object obj) {
        getKey();
        obj.getClass();
        return this.a.setValue(obj);
    }
}
