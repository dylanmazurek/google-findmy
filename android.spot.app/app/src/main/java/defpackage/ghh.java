package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghh {
    public final Long a;
    public final Long b;
    public final lcn c;
    public Long d = 0L;
    public final Long e = 0L;
    public Long f = 0L;
    public Long g = 0L;
    public Long h = 0L;

    public ghh(Long l, Long l2, lcn lcnVar) {
        this.a = l;
        this.b = l2;
        this.c = lcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghh)) {
            return false;
        }
        ghh ghhVar = (ghh) obj;
        if (amr.g(this.a, ghhVar.a) && amr.g(this.b, ghhVar.b) && amr.g(this.c, ghhVar.c) && amr.g(this.d, ghhVar.d) && amr.g(this.e, ghhVar.e) && amr.g(this.f, ghhVar.f) && amr.g(this.g, ghhVar.g) && amr.g(this.h, ghhVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}
