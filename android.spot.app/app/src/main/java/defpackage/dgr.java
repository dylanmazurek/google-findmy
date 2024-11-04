package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgr extends ContextWrapper {
    static final dhe a = new dgn();
    public final List b;
    public final Map c;
    public final dkt d;
    public final int e;
    public final dlu f;
    public final dsc g;
    public final ddg h;
    private final dtk i;
    private dsn j;

    public dgr(Context context, dlu dluVar, dtk dtkVar, dsc dscVar, Map map, List list, dkt dktVar, ddg ddgVar) {
        super(context.getApplicationContext());
        this.f = dluVar;
        this.g = dscVar;
        this.b = list;
        this.c = map;
        this.d = dktVar;
        this.h = ddgVar;
        this.e = 4;
        this.i = new dtj(dtkVar);
    }

    public final dgy a() {
        return (dgy) this.i.a();
    }

    public final synchronized dsn b() {
        if (this.j == null) {
            dsn dsnVar = new dsn();
            dsnVar.A();
            this.j = dsnVar;
        }
        return this.j;
    }
}
