package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msu extends mmt implements mvb {
    public static final bcr b = new bcr();
    public final long a;

    public msu(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.mvb
    public final /* bridge */ /* synthetic */ Object dg(mnb mnbVar) {
        if (((msv) mnbVar.get(msv.a)) == null) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            int j = moz.j(name);
            name.getClass();
            int lastIndexOf = name.lastIndexOf(" @", j);
            if (lastIndexOf < 0) {
                lastIndexOf = name.length();
            }
            StringBuilder sb = new StringBuilder(lastIndexOf + 19);
            String substring = name.substring(0, lastIndexOf);
            substring.getClass();
            sb.append(substring);
            sb.append(" @coroutine#");
            sb.append(this.a);
            currentThread.setName(sb.toString());
            return name;
        }
        throw null;
    }

    @Override // defpackage.mvb
    public final /* bridge */ /* synthetic */ void dh(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof msu) && this.a == ((msu) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
