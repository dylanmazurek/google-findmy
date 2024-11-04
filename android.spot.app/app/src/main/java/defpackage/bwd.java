package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwd {
    static void a(View view) {
        view.cancelDragAndDrop();
    }

    static void b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    static void c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    static void e(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    static boolean f(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        boolean startDragAndDrop;
        startDragAndDrop = view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        return startDragAndDrop;
    }

    public static final cig g(Context context, Class cls, String str) {
        if (!moz.g(str)) {
            return new cig(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
