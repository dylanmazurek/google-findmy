package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buy {
    private static boolean a = false;
    private static Method b = null;
    private static boolean c = false;
    private static Field d;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:            if (((java.lang.Boolean) r8).booleanValue() != false) goto L31;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.bux r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L5
            goto Lca
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r7 = r7.f(r10)
            return r7
        L10:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L84
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L66
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L66
            if (r8 == 0) goto L66
            boolean r1 = defpackage.buy.a
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.buy.b = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.buy.a = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.buy.b
            if (r1 == 0) goto L66
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L65
            r4[r0] = r10     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L65
            if (r8 != 0) goto L5c
            goto L66
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L65
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L66
            goto L6c
        L65:
        L66:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6e
        L6c:
            r0 = 1
            goto Lca
        L6e:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.bwn.t(r7, r10)
            if (r8 == 0) goto L79
            goto L6c
        L79:
            if (r7 == 0) goto L7f
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7f:
            boolean r0 = r10.dispatch(r9, r2, r9)
            goto Lca
        L84:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Lbc
            android.app.Dialog r9 = (android.app.Dialog) r9
            android.content.DialogInterface$OnKeyListener r7 = b(r9)
            if (r7 == 0) goto L9b
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L9b
            goto L6c
        L9b:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto La6
            goto L6c
        La6:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.bwn.t(r7, r10)
            if (r8 == 0) goto Lb1
            goto L6c
        Lb1:
            if (r7 == 0) goto Lb7
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lb7:
            boolean r0 = r10.dispatch(r9, r2, r9)
            goto Lca
        Lbc:
            if (r8 == 0) goto Lc4
            boolean r8 = defpackage.bwn.t(r8, r10)
            if (r8 != 0) goto L6c
        Lc4:
            boolean r7 = r7.f(r10)
            if (r7 != 0) goto Lcb
        Lca:
            return r0
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buy.a(bux, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    private static DialogInterface.OnKeyListener b(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
