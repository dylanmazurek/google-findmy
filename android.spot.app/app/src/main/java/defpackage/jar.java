package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class jar extends jam {
    private final jaz a;

    public jar(String str, jbe jbeVar, jaz jazVar) {
        super(str, jbeVar);
        hwx.J(jazVar.d);
        this.a = jazVar;
    }

    @Override // defpackage.jbe
    public final jaz f() {
        return jaz.a(this.a, g());
    }

    public jar(String str, UUID uuid, jaz jazVar) {
        super(str, uuid);
        hwx.J(jazVar.d);
        this.a = jazVar;
    }
}
