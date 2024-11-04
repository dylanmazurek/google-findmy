package defpackage;

import android.app.Notification;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import java.util.Collections;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bph {
    public bph() {
        Collections.emptyList();
        Collections.emptyList();
    }

    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigLargeIcon(icon);
    }

    public static Shader.TileMode b(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public static final jyz c(Executor executor, mnw mnwVar) {
        return bei.d(new cqp(executor, mnwVar, 0));
    }
}
