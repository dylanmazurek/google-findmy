package defpackage;

import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class euy implements ToIntFunction {
    private final /* synthetic */ int a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        if (this.a != 0) {
            return ((euw) obj).b;
        }
        euz euzVar = euz.BITMAP;
        return ((euz) obj).d;
    }
}
