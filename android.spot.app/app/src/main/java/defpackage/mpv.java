package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpv {
    private Object a;

    public final Object a(mqr mqrVar) {
        mqrVar.getClass();
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Property " + mqrVar.c() + " should be initialized before get.");
    }

    public final void b(mqr mqrVar, Object obj) {
        mqrVar.getClass();
        this.a = obj;
    }

    public final String toString() {
        String str;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            str = "value=".concat(obj.toString());
        } else {
            str = "value not initialized yet";
        }
        return a.ag(str, "NotNullProperty(", ")");
    }
}
