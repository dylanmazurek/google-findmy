package j$.util.function;

import j$.util.concurrent.x;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.function.BiFunction$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class BiFunction$CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        function.getClass();
        return new x(biFunction, function);
    }
}
