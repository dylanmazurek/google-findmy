package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acj extends mpe implements moh {
    final /* synthetic */ ack a;
    final /* synthetic */ ali b;
    final /* synthetic */ int c;
    final /* synthetic */ sr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acj(ack ackVar, ali aliVar, sr srVar, int i) {
        super(1);
        this.a = ackVar;
        this.b = aliVar;
        this.d = srVar;
        this.c = i;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        if (obj != this.a) {
            if (obj instanceof aoc) {
                ali aliVar = this.b;
                sr srVar = this.d;
                int i2 = aliVar.a - this.c;
                int a = srVar.a(obj);
                if (a >= 0) {
                    i = srVar.c[a];
                } else {
                    i = Integer.MAX_VALUE;
                }
                srVar.c(obj, Math.min(i2, i));
            }
            return mlh.a;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself");
    }
}
