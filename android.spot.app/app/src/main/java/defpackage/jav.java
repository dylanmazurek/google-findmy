package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jav extends jar {
    public static final UUID a = UUID.randomUUID();

    private jav(jav javVar, String str, jaz jazVar) {
        super(str, javVar, jazVar);
    }

    @Override // defpackage.jbe
    public final jaz g() {
        return jay.a;
    }

    @Override // defpackage.jbe
    public final jbe h(String str, jaz jazVar) {
        return new jav(this, str, jazVar);
    }

    public jav(UUID uuid, jaz jazVar) {
        super("Missing Trace", uuid, jazVar);
    }

    @Override // defpackage.jbe
    public final void i() {
    }

    @Override // defpackage.jbe
    public final void j() {
    }
}
