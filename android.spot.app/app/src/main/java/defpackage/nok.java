package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nok extends noi implements Serializable, nog {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile nno b;

    public nok() {
        this(nnt.a(), npg.O());
    }

    @Override // defpackage.nog
    public final long a() {
        return this.a;
    }

    @Override // defpackage.nog
    public final nno b() {
        return this.b;
    }

    public nok(long j, nno nnoVar) {
        Map map = nnt.a;
        this.b = nnoVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }
}
