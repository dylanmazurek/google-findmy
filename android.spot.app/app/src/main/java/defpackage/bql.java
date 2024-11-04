package defpackage;

import android.app.RemoteInput;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bql {
    static int a(Object obj) {
        int editChoicesBeforeSending;
        editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
        return editChoicesBeforeSending;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
        RemoteInput.Builder editChoicesBeforeSending;
        editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i);
        return editChoicesBeforeSending;
    }

    public static boolean c(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }
}
