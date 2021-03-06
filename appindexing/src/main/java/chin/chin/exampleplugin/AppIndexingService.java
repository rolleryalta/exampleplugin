package chin.chin.exampleplugin;


import android.app.IntentService;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;

import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.builders.Indexables;

import java.util.ArrayList;

public class AppIndexingService extends IntentService {

    public AppIndexingService() {
        super("AppIndexingService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            ArrayList<Indexable> indexableNotes = new ArrayList<>();

            Indexable noteToIndex = Indexables.noteDigitalDocumentBuilder()
                    .setName("Маша доктор")
                    .setText("Маша Детский Доктор новогоднее обновление - ветеринарная и не только клиника, где вам предстоит лечить животных из мультик Маша и Медведь, и даже самого Деда Мороза: делать уколы, ухаживать за питомцами, лечить зубы! Игры лечить животных это весело, Маша как помощница Дед Мороз снегурочка, вылечит всех! Неугомонная Маша - настоящий подарок для зверей в лесу - она будет лечить животных и даже Дед Мороз - ведь праздник Новый год на носу! В лесу разместилась целая больница для животных, клиника. Если вы ищете детские игры про животных, приключения Маша и Медведь порадуют каждого малыша – девочек и мальчиков! Со зверями, живущими в лесу, может всякое приключиться: синяк, ссадина, зуб заболел еще что-нибудь. Кто же будет лечить животных? А если за помощью обратится Дед Мороз? Конечно, Маша! Ведь нехорошо, если в праздник кто-то болеет! В лесу теперь есть настоящий подарок - доктор для животных, она всегда назначит правильное лечение! Забыв про детские игры, снегурочка Маша в Новый год, переключается на уход за животными: она умеет обработать царапину, измерить давление, лечить зубы и грипп! И кто знает, может снегурочке Маше за это достанется новогодний подарок на праздник? Ветеринарная клиника для животных (новогоднее обновление) это уход за животными. В этой игре для детей Маша снегурочка вы лечить животных, ведь к ней на прием придут все животные: волк, козлик, мишка, свинка, ежик, панда, тигр. В новогодней версии к Маше за помощью придет даже Дед Мороз, и конечно с подарок. В игре ветклиника для животных дети узнают, для чего нужен градусник, научатся пользоваться тонометром, сделают пару уколов и научатся ухаживать за зубками. Маше нужна помощь вашего малыша, особенно под Новый год, чтобы вылечить всех животных в детской игре про животных игры ухаживать за питомец (ветеринар), игра подойдет и для девочек, и для мальчиков!  - 12 персонажей любимого мультик Маша и Медведь - 35 способов лечить животных - лечение зубов у животных, стоматология игры (Маша Доктор - зубной врач) - три мини-игры для детей Если вы в поисках игры для девочек Доктор про животных: Маша Доктор отлично подойдет вашей малышке! Большой выбор животных обеспечит интерес ребенка. В игре можно лечить зубы! Научившись ухаживать за животными на экране, ребенок сможет ухаживать за ними в реальной жизни. Детские игры лучший способ знакомства с миром, особенно, если это игра про животных с героями мультфильма Masha i Medved. Вы ищите игры лечить животных: игры лечить зубы или игры про доктора бесплатно: это настоящий подарок! Интересный сюжет, возможность обучить ребенка делать уход за животными в игровой форме: все есть в игре для малышей ветклиника. Детские игры для девочек про животных не всегда бывают интересными, но это не про Маша Доктор: какая девочка не захочет, чтобы у нее был салон красоты для животных? Пока мамы изучают кулинария рецепты и рецепты на каждый день, Маша и Миша объяснят детям, что такое уход за животными и как лечить животных: ведь даже на праздник Новый год может произойти что угодно! Обучающие развивающие игры про животных несут радость особенно под Новый год, когда в них - герои мультика - Маша и Миша для детей. Загружайте Маша и Медведь игра доктор и пусть дети выполнят главную задачу - Маша детский доктор должна вылечить и отправить каждого зверя домой здоровым, лучшие игры для девочек! Игры доктор ветеринарная клиника для животных подходит для детей от 3 до 10 лет, приложение понятно даже маленьким. Игра про зверей интересна и для мальчиков, и для девочек. Мы делаем самые добрые игры для детей 2,3,4,5,6 лет! Наши обучающие детские игры для детей - игры для девочек бесплатно и игры для мальчиков на странице разработчика: https://play.google.com/store/apps/dev?id=5356075630341900630 Маша и Медведь: Игры для детей Игры про Доктора (игра в доктора) - Маша детский Доктор: ветеринарная клиника Маша Каша: кухня и ресторан Свяжитесь с нами, если у вас возникли вопросы и предложения! Оцените развивающие игры для детей: support@indigokidsgames.com")
                    .setUrl("http://indigokidsgames.com/portfolio-items/masha_doctor")
                    .build();

            indexableNotes.add(noteToIndex);

            Indexable[] notesArr = new Indexable[indexableNotes.size()];
            notesArr = indexableNotes.toArray(notesArr);

            // batch insert indexable notes into index
            FirebaseAppIndex.getInstance().update(notesArr);
        } catch (Exception e) {
            Log.wtf("AppIndexingPlugin", e);
        }


    }
}

