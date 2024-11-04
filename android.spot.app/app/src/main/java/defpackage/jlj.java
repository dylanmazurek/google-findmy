package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum jlj implements jei {
    KEY,
    VALUE;

    @Override // defpackage.jei
    public final /* synthetic */ Object a(Object obj) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((Map.Entry) obj).getValue();
            }
            throw null;
        }
        return ((Map.Entry) obj).getKey();
    }
}
