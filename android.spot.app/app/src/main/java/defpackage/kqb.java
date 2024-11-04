package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kqb implements kps {
    private final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kpp
    public final void a(Object obj, Object obj2) {
        if (this.a != 0) {
            Map.Entry entry = (Map.Entry) obj;
            obj2.b(kqa.a, entry.getKey());
            obj2.b(kqa.b, entry.getValue());
            return;
        }
        throw new kpq("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
