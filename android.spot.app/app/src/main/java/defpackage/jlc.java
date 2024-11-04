package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlc extends jgf {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ njz b;

    public jlc(Map.Entry entry, njz njzVar) {
        this.a = entry;
        this.b = njzVar;
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        entry.getKey();
        return this.b.g(entry.getValue());
    }
}
