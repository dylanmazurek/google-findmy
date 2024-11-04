package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzo extends mjo {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final mgy c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public final ktf i;

    public lzo() {
        throw null;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", this.c);
        return q.toString();
    }

    public lzo(String str, int i, CronetEngine cronetEngine) {
        super(null);
        this.i = mjz.f;
        this.d = 4194304;
        this.c = new mgy(InetSocketAddress.createUnresolved(str, i), mfh.d(str, i), new njz(this, null));
        this.b = cronetEngine;
    }
}
